import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class Listak1
{
    // A. match_ends
    // Bemenet: sztringek listája. Számoljuk meg, hogy a bemenetben
    // hány olyan sztring van, melynek a hossza legalább 2 s az
    // első karaktere egyezik az utolsó karakterével. A visszatérési
    // érték ezen feltételeket kielégítő sztringek száma legyen.
    private static int matchEnds(List<String> words)
    {
        AtomicInteger counter = new AtomicInteger();
        words.forEach(
                (n) -> {
                    if (n.length() >= 2 && n.charAt(0) == n.charAt(n.length()-1)) {
                       counter.set(counter.get() + 1);
                    }
                }
        );
        return counter.get();
    }

    // B. front_x
    // Bemenet: sztringek listája. Egy olyan listával térjünk vissza,
    // melyben a szavak rendezve vannak, viszont az "x"-szel kezdődő szavak
    // kerüljenek előre.
    // Példa: ["mix", "xyz", "apple", "xanadu", "aardvark"] bemenet esetén
    // az eredmény: ["xanadu", "xyz", "aardvark", "apple", "mix"].
    // Tipp: használhatunk 2 listát is, melyeket külön-külön rendezünk, majd
    //       egyesítjük őket.
    private static List<String> frontX(List<String> words)
    {
        // Létrehozunk két listát. Az egyik listában csak az x-el
        // kezdődő szringeket tároljuk, a másikban a többi szót.
        List<String> starts_with_x = new ArrayList<String>();
        List<String> other_words = new ArrayList<String>();

        // Egy foreach ciklussal végigmegyünk a kapott listán és
        // hozzáadjuk a szavakat a listáinkhoz.
        words.forEach(
                (n) -> {
                    if (n.charAt(0) == 'x') {
                        starts_with_x.add(n);
                    }else{
                        other_words.add(n);
                    }
                }
        );

        // A hozzáadás után rendezzük a két listánkat.
        Collections.sort(starts_with_x);
        Collections.sort(other_words);

        // Létrehozunk egy új listát, amiben vissza fogjuk adni az
        // összes sztringet és hozzáadjuk a szavainkat.
        // A lista létrehozásánál megadható egy már létező lista aminek
        // az értékeit fel fogja venni, így mmér csak a második listát
        // kell hozzáadnunk és mehet is a return.
        List<String> ans = new ArrayList<String>(starts_with_x);
        ans.addAll(other_words);

        return new ArrayList<String>(ans);
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static void test(int got, int expected)
    {
        String prefix = (got == expected) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static void test(List<String> got, List<String> expected)
    {
        var prefix = (got.equals(expected)) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Ezt ne módosítsuk.
    // A main() fv. meghívja a fenti fv.-eket különféle paraméterekkel,
    // s a test() fv. segítségével megnézi, hogy az eredmények helyesek-e.
    public static void main(String[] args)
    {
        System.out.println("match_ends");
        test(matchEnds(List.of("aba", "xyz", "aa", "x", "bbb")), 3);
        test(matchEnds(List.of("", "x", "xy", "xyx", "xx")), 2);
        test(matchEnds(List.of("aaa", "be", "abc", "hello")), 1);

        System.out.println();
        System.out.println("front_x");
        test(frontX(List.of("bbb", "ccc", "axx", "xzz", "xaa")),
                List.of("xaa", "xzz", "axx", "bbb", "ccc"));
        test(frontX(List.of("ccc", "bbb", "aaa", "xcc", "xaa")),
                List.of("xaa", "xcc", "aaa", "bbb", "ccc"));
        test(frontX(List.of("mix", "xyz", "apple", "xanadu", "aardvark")),
                List.of("xanadu", "xyz", "aardvark", "apple", "mix"));
    }

}