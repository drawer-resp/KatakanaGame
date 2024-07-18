import java.util.HashMap;
import java.util.Map;

public class Mondai
{
    private static String quest;
    private static final Map<String, String> ROMAJI_TO_KATAKANA_MAP;

    static
    {
        ROMAJI_TO_KATAKANA_MAP = new HashMap<>();
        ROMAJI_TO_KATAKANA_MAP.put("a", "ア");
        ROMAJI_TO_KATAKANA_MAP.put("i", "イ");
        ROMAJI_TO_KATAKANA_MAP.put("u", "ウ");
        ROMAJI_TO_KATAKANA_MAP.put("e", "エ");
        ROMAJI_TO_KATAKANA_MAP.put("o", "オ");
        ROMAJI_TO_KATAKANA_MAP.put("ka", "カ");
        ROMAJI_TO_KATAKANA_MAP.put("ki", "キ");
        ROMAJI_TO_KATAKANA_MAP.put("ku", "ク");
        ROMAJI_TO_KATAKANA_MAP.put("ke", "ケ");
        ROMAJI_TO_KATAKANA_MAP.put("ko", "コ");
        ROMAJI_TO_KATAKANA_MAP.put("sa", "サ");
        ROMAJI_TO_KATAKANA_MAP.put("shi", "シ");
        ROMAJI_TO_KATAKANA_MAP.put("su", "ス");
        ROMAJI_TO_KATAKANA_MAP.put("se", "セ");
        ROMAJI_TO_KATAKANA_MAP.put("so", "ソ");
        ROMAJI_TO_KATAKANA_MAP.put("ta", "タ");
        ROMAJI_TO_KATAKANA_MAP.put("chi", "チ");
        ROMAJI_TO_KATAKANA_MAP.put("tsu", "ツ");
        ROMAJI_TO_KATAKANA_MAP.put("te", "テ");
        ROMAJI_TO_KATAKANA_MAP.put("to", "ト");
        ROMAJI_TO_KATAKANA_MAP.put("na", "ナ");
        ROMAJI_TO_KATAKANA_MAP.put("ni", "ニ");
        ROMAJI_TO_KATAKANA_MAP.put("nu", "ヌ");
        ROMAJI_TO_KATAKANA_MAP.put("ne", "ネ");
        ROMAJI_TO_KATAKANA_MAP.put("no", "ノ");
        ROMAJI_TO_KATAKANA_MAP.put("ha", "ハ");
        ROMAJI_TO_KATAKANA_MAP.put("hi", "ヒ");
        ROMAJI_TO_KATAKANA_MAP.put("fu", "フ");
        ROMAJI_TO_KATAKANA_MAP.put("he", "ヘ");
        ROMAJI_TO_KATAKANA_MAP.put("ho", "ホ");
        ROMAJI_TO_KATAKANA_MAP.put("ma", "マ");
        ROMAJI_TO_KATAKANA_MAP.put("mi", "ミ");
        ROMAJI_TO_KATAKANA_MAP.put("mu", "ム");
        ROMAJI_TO_KATAKANA_MAP.put("me", "メ");
        ROMAJI_TO_KATAKANA_MAP.put("mo", "モ");
        ROMAJI_TO_KATAKANA_MAP.put("ya", "ヤ");
        ROMAJI_TO_KATAKANA_MAP.put("yu", "ユ");
        ROMAJI_TO_KATAKANA_MAP.put("yo", "ヨ");
        ROMAJI_TO_KATAKANA_MAP.put("ra", "ラ");
        ROMAJI_TO_KATAKANA_MAP.put("ri", "リ");
        ROMAJI_TO_KATAKANA_MAP.put("ru", "ル");
        ROMAJI_TO_KATAKANA_MAP.put("re", "レ");
        ROMAJI_TO_KATAKANA_MAP.put("ro", "ロ");
        ROMAJI_TO_KATAKANA_MAP.put("wa", "ワ");
        ROMAJI_TO_KATAKANA_MAP.put("wo", "ヲ");
        ROMAJI_TO_KATAKANA_MAP.put("n", "ン");

        ROMAJI_TO_KATAKANA_MAP.put("ga", "ガ");
        ROMAJI_TO_KATAKANA_MAP.put("gi", "ギ");
        ROMAJI_TO_KATAKANA_MAP.put("gu", "グ");
        ROMAJI_TO_KATAKANA_MAP.put("ge", "ゲ");
        ROMAJI_TO_KATAKANA_MAP.put("go", "ゴ");
        ROMAJI_TO_KATAKANA_MAP.put("za", "ザ");
        ROMAJI_TO_KATAKANA_MAP.put("ji", "ジ");
        ROMAJI_TO_KATAKANA_MAP.put("zu", "ズ");
        ROMAJI_TO_KATAKANA_MAP.put("ze", "ゼ");
        ROMAJI_TO_KATAKANA_MAP.put("zo", "ゾ");
        ROMAJI_TO_KATAKANA_MAP.put("da", "ダ");
        ROMAJI_TO_KATAKANA_MAP.put("de", "デ");
        ROMAJI_TO_KATAKANA_MAP.put("do", "ド");
        ROMAJI_TO_KATAKANA_MAP.put("ba", "バ");
        ROMAJI_TO_KATAKANA_MAP.put("bi", "ビ");
        ROMAJI_TO_KATAKANA_MAP.put("bu", "ブ");
        ROMAJI_TO_KATAKANA_MAP.put("be", "ベ");
        ROMAJI_TO_KATAKANA_MAP.put("bo", "ボ");
        ROMAJI_TO_KATAKANA_MAP.put("pa", "パ");
        ROMAJI_TO_KATAKANA_MAP.put("pi", "ピ");
        ROMAJI_TO_KATAKANA_MAP.put("pu", "プ");
        ROMAJI_TO_KATAKANA_MAP.put("pe", "ペ");
        ROMAJI_TO_KATAKANA_MAP.put("po", "ポ");

        ROMAJI_TO_KATAKANA_MAP.put("kya", "キャ");
        ROMAJI_TO_KATAKANA_MAP.put("kyu", "キュ");
        ROMAJI_TO_KATAKANA_MAP.put("kyo", "キョ");
        ROMAJI_TO_KATAKANA_MAP.put("sha", "シャ");
        ROMAJI_TO_KATAKANA_MAP.put("shu", "シュ");
        ROMAJI_TO_KATAKANA_MAP.put("sho", "ショ");
        ROMAJI_TO_KATAKANA_MAP.put("cha", "チャ");
        ROMAJI_TO_KATAKANA_MAP.put("chu", "チュ");
        ROMAJI_TO_KATAKANA_MAP.put("cho", "チョ");
        ROMAJI_TO_KATAKANA_MAP.put("nya", "ニャ");
        ROMAJI_TO_KATAKANA_MAP.put("nyu", "ニュ");
        ROMAJI_TO_KATAKANA_MAP.put("nyo", "ニョ");
        ROMAJI_TO_KATAKANA_MAP.put("hya", "ヒャ");
        ROMAJI_TO_KATAKANA_MAP.put("hyu", "ヒュ");
        ROMAJI_TO_KATAKANA_MAP.put("hyo", "ヒョ");
        ROMAJI_TO_KATAKANA_MAP.put("mya", "ミャ");
        ROMAJI_TO_KATAKANA_MAP.put("myu", "ミュ");
        ROMAJI_TO_KATAKANA_MAP.put("myo", "ミョ");
        ROMAJI_TO_KATAKANA_MAP.put("rya", "リャ");
        ROMAJI_TO_KATAKANA_MAP.put("ryu", "リュ");
        ROMAJI_TO_KATAKANA_MAP.put("ryo", "リョ");
        ROMAJI_TO_KATAKANA_MAP.put("gya", "ギャ");
        ROMAJI_TO_KATAKANA_MAP.put("gyu", "ギュ");
        ROMAJI_TO_KATAKANA_MAP.put("gyo", "ギョ");
        ROMAJI_TO_KATAKANA_MAP.put("bya", "ビャ");
        ROMAJI_TO_KATAKANA_MAP.put("byu", "ビュ");
        ROMAJI_TO_KATAKANA_MAP.put("byo", "ビョ");
        ROMAJI_TO_KATAKANA_MAP.put("pya", "ピャ");
        ROMAJI_TO_KATAKANA_MAP.put("pyu", "ピュ");
        ROMAJI_TO_KATAKANA_MAP.put("pyo", "ピョ");
        ROMAJI_TO_KATAKANA_MAP.put("ja", "ジャ");
        ROMAJI_TO_KATAKANA_MAP.put("ju", "ジュ");
        ROMAJI_TO_KATAKANA_MAP.put("jo", "ジョ");

        ROMAJI_TO_KATAKANA_MAP.put("fa", "ファ");
        ROMAJI_TO_KATAKANA_MAP.put("fi", "フィ");
        ROMAJI_TO_KATAKANA_MAP.put("fe", "フェ");
        ROMAJI_TO_KATAKANA_MAP.put("fo", "フォ");
    }

    public static String convert(String romaji)
    {
        StringBuilder katakana = new StringBuilder();
        int len = romaji.length();
        int i = 0;
        while(i < len)
        {
            boolean match = false;
            for(int j = Math.min(len, i+3); j>i ; j--)
            {
                String substring = romaji.substring(i, j).toLowerCase();
                if(ROMAJI_TO_KATAKANA_MAP.containsKey(substring))
                {
                    katakana.append(ROMAJI_TO_KATAKANA_MAP.get(substring));
                    i=j;
                    match = true;
                    break;
                }
            }
            if(!match)
            {
                katakana.append(romaji.charAt(i));
                i++;
            }
        }
        return katakana.toString();
    }
    public static void main(String[] args) {
        String romaji = "ojou";
        String katakana = Mondai.convert(romaji);
        System.out.println("Romaji: " + romaji);
        System.out.println("Katakana: " + katakana);
    }
}
