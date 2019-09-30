package com.plain.java.programs;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSpecialCharacters {

	protected static final Pattern ALLOWED_CHARACTERS = Pattern.compile("[^\\p{Print}]");

	private static final String PLAIN_ASCII = "AEIOU" // grave
			+ "AEIOUY" // acute
			+ "AEIOUY" // circumflex
			+ "AON" // tilde
			+ "AEIOUY" // umlaut
			+ "A" // ring
			+ "C" // cedilla
			+ "OU" // double acute
			+ "B";

	private static final String UNICODE = "\u00C0\u00C8\u00CC\u00D2\u00D9" + "\u00C1\u00C9\u00CD\u00D3\u00DA\u00DD"
			+ "\u00C2\u00CA\u00CE\u00D4\u00DB\u0176" + "\u00C3\u00D5\u00D1" + "\u00C4\u00CB\u00CF\u00D6\u00DC\u0178"
			+ "\u00C5" + "\u00C7" + "\u0150\u0170" + "\u00df";

	public static void main(String[] args) throws UnsupportedEncodingException {
		/*
		 * String myString = "TTE. PERÓN 315 p.1 o"; ByteBuffer byteBuffer =
		 * StandardCharsets.UTF_8.encode(myString); System.out.println(byteBuffer);
		 * 
		 * System.out.println("--------------");
		 * 
		 * String text = "This is an example é";
		 * 
		 * String s1 = "l'Ã©pargne"; String s2 = new String(s1.getBytes("iso-8859-1"),
		 * "utf8"); System.out.println(s2); System.out.println("--------------");
		 * 
		 * System.out.println(myString.length()); String myString2 = new
		 * String(myString.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
		 * System.out.println(myString2.length()); System.out.println(myString);
		 * System.out.println(myString2); System.out.println("--------------");
		 * 
		 * String readable = "äöüÄÖÜßáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙñÑ"; String unreadable = new
		 * String(readable.getBytes("UTF-8"), "ISO-8859-15");
		 * System.out.println(readable); System.out.println(new
		 * String(unreadable.getBytes("ISO-8859-15"), "UTF-8"));
		 */

		String patt = "[a-zA-Z0-9\\- \\s.,\\/()\\[\\]_]";
		String patt1 = "[a-zA-Z0-9\\- \\s.,:()\\'\";>{}\\[\\]!?\\*\\/\\#_`]";
		// String patt = "[^a-zA-Z0-9\\- \\s]";
		Pattern pattern = Pattern.compile(patt);
		String specialChar = "banßdham";
		String tChar = "\u00df";
		String myString = "bandham- 0-9";
		String test = "Desde nueva sangría ";
		String regex = "àèìòùÀÈÌÒÙáéíóúýÁÉÍÓÚÝâêîôûÂÊÎÔÛãñõÃÑÕäëïöüÿÄËÏÖÜŸçÇßØøÅåÆæœ";
		String t = "schön";
		String filtered = Normalizer.normalize(regex, Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
		// System.out.println(pattern.matcher(myString).find());

		String res = specialChar.replaceAll(tChar, "");
		System.out.println(res);

		// System.out.println(getText().replaceAll(patt1, ""));

		/*
		 * if (true) { long startTime1 = System.currentTimeMillis(); for (int i = 0; i <
		 * 10000; i++) { Normalizer.normalize(getText(),
		 * Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+", ""); } long
		 * endTime1 = System.currentTimeMillis();
		 * System.out.println("Total Time -Normalize = " + (endTime1 - startTime1)); }
		 * if (false) { long startTime2 = System.currentTimeMillis(); for (int i = 0; i
		 * < 10000; i++) { filter(getText()); } long endTime2 =
		 * System.currentTimeMillis(); System.out.println("Total Time -CharByChar = " +
		 * (endTime2 - startTime2)); }
		 */
	}

	static String getText() {
		return "Lesson 0.01 - IntroductionIntroductionSee also: w:French languageFrench is a Romance language descended from Latin which developed as a result of Celtic and Frankish influences in Gaul (now France). Being a Romance language, it is closely related to Portuguese, Spanish, Italian, and Romanian, as well as many other languages. There are over 87 million native French speakers and an additional 68 million non-native speakers in the world.HistoryFurther information: w:History of the French languageDuring the Roman occupation of Gaul, the Latin language was imposed on the natives. This Latin language eventually developed into what is known as Vulgar Latin, which was still very similar to Latin. Over the centuries, due to Celtic and Germanic influences (particularly the Franks), la langue d'oïl was developed. A dialect of la langue d'oïl known as le francien was the language of the court, and thus became the official language of what was to become the Kingdom of France, and later the Nation-State of France.From medieval times until the 19th century, French was the dominant language of diplomacy, culture, administration, trade and royal courts across Europe. Due to these factors, French was the lingua franca of this time period.French has influenced many languages world wide, including English. It is through French (or more precisely Norman, a dialect of la langue d'oïl) that English gets about one third of its vocabulary.Extent of the LanguageMain article: w:La FrancophonieMain article: w:French colonial empiresIn modern times, French is still a significant diplomatic language: it is an official language of the United Nations, the Olympic Games, and the European Union. It is also the official language of 29 countries and is spoken in France, Belgium, Switzerland, Luxemburg, Tunisia, Morocco, Senegal, Haiti, the Ivory Coast, Madagascar, the Congo, Algeria, Niger, Mali, Burkina Faso, Togo, Gabon, the Seychelles, Burundi, Chad, Rwanda, Djibouti, Cameroon, Mauritius, and Canada (mostly in the province of Québec, where it is the primary language, but it is also used in other parts of thecountry. All consumer product packages in Canada are required by law to have both English and French labels).Allons-y! Bonne chance!French is spoken all around the world.\r\n"
				+ "Lesson 0.02 - Learning FrenchReasons to learn FrenchAs mentioned earlier, French is a major diplomatic language. You are bound to find speakers almost anywhere in the world. In addition to these societal reasons, there are hundreds of famous French novels and nonfiction works in a wide variety of subjects. Because much can be lost in translation, the best way to read these works is in the original language.Advice on studying FrenchMain article: How to learn a languageFrench tends to have a reputation among English speakers as hard to learn. While it is true that it poses certain difficulties to native English-speakers, it may be noted that English is also considered 'difficult' to learn, and yet we learned it without the benefit of already knowing a language. In fact, the French language can be learned in only 10 months(http://web.archive.org/web/20071211081522/http://en.wikinerds.org/index.php/Learning_French_in_10_months, if only for the specific purpose of passing a standardized test, such as the Test d'Evaluation de Français.According to the Common European Framework of Reference for Languages, in order to reach the level of 'Independent User' (after completing Level B2), you must complete 400 hours of effective learning (so if you study 4 hours a week, every single week of the year, you would need two years to achieve it). Any way you look at it, learning any new language requires a long-term commitment. Remember, that like any skill, it requires a certain amount of effort. And it is likely that if you do not practice your French regularly, you will begin to forget it. Try to make French practice a part of your routine; even if it's not daily, at least make it regular.Also remember that you are learning a new skill. Try to master the simple stuff before moving on to the more complex concepts. We all have to add and subtract before we can do calculus. French is a complete language. While this course can teach you to read and write in French, these are only half of the skills that make up fluency. A written document cannot teach much about listening to and speaking French. You must train all of these skills, and they will reinforce one another. For listening and speaking, find a native speaker to help you.The very best way to learn French is to visit France or another French-speaking country. This allows you to start with a clean slate, as babies do. However, since most of us are unwilling or unable to take that step, the next best option is immersion. If you are serious about learning French, a period of immersion (during which you live in a Francophone culture) is a good idea once you have some basic familiarity with the language. If you can't travel to a French-speaking country, then try listening to French-language programs on the radio, TV, or the Internet. Rent or buy French-language movies (many American and U.K. movies have a French language option). Pay attention to pronunciation. Grab a French speaker you meet and talk to him or her in French. Listen, speak, and practice. Read French newspapers and magazines. Google's news page, which links to French-language news stories, is an excellent source that will enrich your vocabulary.Book organizationThis book is divided into one set of preliminary lessons, the page you are reading now, and four increasingly complex lesson levels. The introductory lessons will teach you pronunciation and phrases. In the first level, you will learn basic grammar, including pronouns, the present indicative, most common present tense, and several irregularly-conjugated verbs. In the second level, the passé composé, the most common past tense, isgiven, along with many other irregular verbs. In the third level, you will learn several more tenses and \r\n"
				+ "complex grammar rules. The fourth level (still in development), will be conducted in French and will focus on French literature and prose writing. For more on course structure, and information on how you can help improve this book, see the lessons planning page.\r\n"
				+ "Lesson 0.03 - The AlphabetIntroductionFrench Grammar  Print version  audio (info 101 kb help) The French Alphabet  L'alphabet françaisCharactersAa    Bb  Cc  Dd    EeFfGgHh  IiPronunciationahbay say day   euheff    jhayash eeCharactersJjKk  Ll   Mm  NnOo   PpQq  RrPronunciationghee kah el   emm ennoh    payku   airCharactersSsTt   Uu Vv    WwXx   YyZzPronunciationess    tay  oo  vay   dubla-vay eeks ee-grehk zedIn addition, French uses several accents which are worth understanding. These are: à, è, ù, (grave accents)and é (acute accent). A circumflex applies to all vowels: â, ê, î, ô, û. A tréma (French for dieresis) is alsoapplied: ë, ï, ü, ÿ. Two combined letters are used: æ and œ, and a cedilla is used on the c to make it soundlike an English s: ç. More information on accents will be found in the next section.Letters and examplesFrench Grammar  Print version  audio (info 101 kb  help) The French Alphabet  L'alphabet françaisletterpronunciationname in French(in IPA transcription)Aalike a in father/a/Bblike b in may\"be/be/Ccbefore e and i: like c in centerbefore a, o, or u: like c in cat/se/Ddlike d in dog/de/Eeapprox. like u in burp**/ə/Fflike f in fog/ɛf/Ggbefore e and i: like s in measurebefore a, o, or u: like g in get/ʒe/Hhaspirated h: see note below*non-aspirated h: not pronounced***/a/Iilike ea in team/i/Jjlike s in measure/ʒi/Kklike k in kite/ka/Lllike l in lemon/ɛl/Mmlike m in minute/ɛm/\r\n"
				+ "Nnlike n in note/ɛn/Ooclosed: approx. like u in nutopen: like o in nose/o/Pplike p in pen*/pe/Qqlike k in kite/ky/ see 'u'for detailsRrforce air through the back of your throatnear the position of gargling,but sounding soft/ɛʀ/Sslike s in sister at beginningof word or with two s'sor like z in amazing if only one s/ɛs/Ttlike t in top/te/UuSay the English letter e,but make your lips say \"oo\"./y/Vvlike v in violin/ve/WwDepending on the derivation of the word,like v as in violin, or w inwater/dubləve/Xxeither /ks/ in socks,or /gz/ in exit/iks/Yylike ea in leak/igrək/Zzlike z in zebra/zɛd/Final consonantsIn French, certain consonants are silent when they are the final letter of a word. The letters p (as in 'coup'), s(as in 'héros'), t (as in 'chat'), d (as in 'marchand'), and x (as in 'paresseux'), are generally not pronounced at the end of a word. They are pronounced if there is an e letter after ('coupe', 'chatte', 'marchande', etc.)Dental consonantsThe letters d, l, n,s, t, and z are pronounced with the tip of the tongue against the lower teeth and the middle of the tongue against the roof of the mouth. In English, one would pronounce these letters with the tip of the tongue at the roof of one's mouth. It is very difficult to pronounce a word like 'voudrais' properly with the dformed in the English manner.b and pUnlike English, when you pronounce the letters 'b' and 'p' in French, little to no air should come out of your mouth. In terms of phonetics, the difference in the French 'b' and 'p' and their English counterparts is one of aspiration. (This is not the same as the similarly-named concept of 'h' aspiré discussed below). Fortunately, in English both aspirated and unaspirated variants (allophones) exist, but only in specific environments. If you're a native speaker, say the word 'pit' and then the word 'spit' out loud. Did you notice the extra puff of air in the first word that doesn't come with the second? The 'p' in 'pit' is aspirated [pʰ]; the 'p' in 'spit' is not (like the 'p' in any position in French).Exercise\r\n"
				+ "Get a loose piece of printer paper or notebook paper.1.Hold the piece of paper about one inch (or a couple of centimeters) in front of your face.2.Say the words baby, and puppy like you normally would in English. Notice how the paper moved when you said the 'b' and the 'p' respectively.3.Now, without making the piece of paper move, say the words belle (the feminine form of beautiful in French, pronounced like the English 'bell.'), and papa (the French equivalent of \"Dad\").4.If the paper moved, your pronunciation is slightly off. Concentrate, and try it again.If the paper didn't move, congratulations! You pronounced the words correctly!Aspirated vs. non-aspirated hIn French, the letter h can be aspirated (h aspiré), or not aspirated (h non aspiré), depending on which language the word was borrowed from. What do these terms mean?Ex.: the word héros, (hero) has an aspirated h, because when the definite article le is placed before it, the result is le héros, and both words must be pronounced separately. However, the feminine form of héros, héroïne is a non-aspirated h. Therefore, when you put the definite article in front of it, it becomes l'héroïne, and is pronounced as one word.Remember that in French, an h is NEVER pronounced, whether it is aspirated or not aspirated!The only way to tell if the h at the beginning of a word is aspirated is to look it up in the dictionary. Some dictionaries will place an asterisk (*) in front of the entry word in the French-English H section if the h is aspirated. Other dictionaries will include it in the pronunciation guide after the key word by placing a (') before the pronunciation. In short, the words must be memorized.Here is a table of some basic h words that are aspirated and not aspirated:aspiratednon-aspiratedhéros, hero (le héros)héroïne, heroine (l'héroïne)haïr, to hate (je hais or j'haïs...)habiter, to live (j'habite...)huit, eight (le huit novembre)harmonie, harmony (l'harmonie)ExerciseGrab a French-English dictionary and find at least ten aspirated h words, and ten non-aspirated hwords1.On a piece of paper, write down the words you find in two columns2.Look at it every day and memorize the columns3.PunctuationFrom Wiktionary:French Vocabulary  Print version  audio (info 608 kb  help) Punctuation  La ponctuation&esperluette, et commercial,virgule{}accolades~tilde\r\n"
				+ "[show ]'apostrophe=égal %pourcent@arobase, a commercial, arobe*astérisque$dollar.point guillemets!point d'exclamation+plus\\barre oblique inverse>supérieur à#dièse[]crochets<inférieur à?point d'interrogation:deux points-moins, tiret, trait d'union_soulignement;point virgule()parenthèses/barre obliqueThe punctuation symbols in French operates very similarly to English with the same meaning. The only punctuation symbol not present in French would be the quotation marks; these are replaced by the guillemetsshown in the table above.The two stroke punctuation marks (such as ;, :, ?, !) may require a non-breaking space before or after the mark in question. For purposes of this textbook, this style will be used to maintain consistency with other projects on WikiMedia - however, the location and context at which you will use French may have different spacing rules. The following resources are an example of available materials for further reading:Lexique des règles typographiques en usage à l'Imprimerie nationale, ISBN 9782743304829, Imprimerie nationaleWikipédia:Conventions typographiques(http://fr.wikipedia.org/wiki/Wikipédia:Conventions_typographiques#Espaces) French Style Guide (http://www.cprp.ca/guide.php?category_name=autres-ressources/#english) , Nova Scotia Department of Education (for Canadian French)EXERCISE  Translator (http://translate.google.com/translate_t)  Exercise Appendix  Print version E: 0.03 1 - Punctuation - State the Word\r\n"
				+ "Lesson 0.04 - AccentsIntroductionFive different kinds of accent marks are used in written French. In many cases, an accent changes the sound of the letter to which it is added. In others, the accent has no effect on pronunciation. Accents in French never indicate stress (which always falls on the last syllable). The following table lists every French accent mark and the letters with which it can be combined:accentlettersusedexamplesacute accent(accent aigu)é onlyéléphant: elephantgrave accent(accent grave)è, à, ùfièvre: fever, là: there, où: wherecircumflex(accent circonflexe)â, ê, î,ô, ûgâteau: cake,être: to be, île: island,chômage: unemployment,dû: past participle of devoirdiaeresis(tréma)ë, ï, ü, ÿ[1]Noël: Christmas, maïs: corn, aigüe: acute(fem)[2]cedilla(cédille)ç onlyfrançais: French↑ Note: The letter ÿ is only used in very rare words, mostly old town names like L'Haÿ-Les-Roses, aParis surburb. This letter is pronounced like ï.1.↑ Note: As of the spelling reform of 1990, the diaresis indicating gu is not a digraph on words finishing in guë is now placed on the u in standard (AKA \"académie française\" French) : aigüe and notaiguë, cigüe and not ciguë, ambigüe and not ambiguë (acute(fem), conium, ambiguous). Since thisreform is relatively recent and mostly unknown to laypeople, the two spellings can be used interchangeably.2.Acute accent - Accent aiguThe acute accent(French, accent aigu) is the most common accent used in written French. It is only used with the letter e and is always pronounced /e/.One use of the accent aigu is to form the past participle of regular -er verbs.infinitivepast participleaimer, to loveaimé, lovedregarder, to watchregardé, watchedAnother thing to note is if you are unsure of how to translate certain words into English from French, and the word begins with é, replace that with the letter s and you will occasionally get the English word, or an approximation thereof:\r\n"
				+ "étable --> stable (for horses)école --> scole --> schoolil étudie --> il studie --> he studiesAnd to combine what you already know about the accent aigu, here is one last example:étranglé (from étrangler) --> stranglé --> strangledNB: This will not work with every word that begins with é.Grave accent - Accent graveà and ùIn the case of the letters à and ù, the grave accent(Fr. accent grave), is used to graphically distinguish one word from another.without accent gravewith accent gravea (3rd pers. sing of avoir, to have)à (preposition, to, at, etc.)la (definite article for feminine nouns)là (there)ou (conjunction, or)où (where)èUnlike à and ù, è is not used to distinguish words from one another. The è is used for pronunciation. In careful speech, an unaccented e is pronounced like the article a in english (a schwa), and in rapid speech is sometimes not pronounced at all. The è is pronounced like the letter e in pet.Cedilla - CédilleThe cedilla is used only with the letter \"c\", and is said to make the \"c\" soft, making it equivalent to the English and French S.le garçon --> (boy)French Accents on computersWhile French keyboards are available, some French students may need to enter accented characters on an English keyboard. There are two methods of doing so - some modern word processing software allow entering accents using a key combination, while other applications may require using an Alt code.In supporing word processing software, you can initiate an accent by entering an appropriate key combination.accentkey combinationacute accent(accent aigu)CTRL-'grave accent(accent grave)CTRL-`\r\n"
				+ "circumflex(accent circonflexe)CTRL-SHIFT-6diaeresis(tréma)CTRL-;cedilla(cédille)CTRL-,On applications that do not support the key combinations, the alternate method available to students is to hold down the ALT key, and enter the code number on the keypad. In some applications, you may also need to have the numlock turned on to avoid undesirable effects.Character  code  Charactercodeà133    À0192â131    Â0194ä132    Ä142æ {ae}145    Æ {ae}146œ {oe}0156  Œ {oe}0140ç135    Ç128é130    É144ê136    Ê0202è138    È0200ë137    Ë0203î140    Î0206ï139    Ï0207ô147    Ô0212ù151    Ù0217û150    Û0219ü129    Ü154 or 0220174    »175\r\n"
				+ "";
	}

	/**
	 * Converts the string to be cleaned to upper case, trims any leading or
	 * trailing white space, maps some unicode characters to ascii, and then removes
	 * any non-printable/non-ascii characters
	 *
	 * @param stringToFilter the string to be filtered
	 * @return String
	 */
	public static String filter(String stringToFilter) {
		String result = null;
		if (stringToFilter != null) {

			String s = mapUnicodeToAscii(stringToFilter.toUpperCase());

			// TODO: may want to replace <>&"' which screw up XML marshaling

			s = ALLOWED_CHARACTERS.matcher(s).replaceAll("").trim();

			if (s.length() > 0) {
				result = s;
			}
		}

		return result;
	}

	/**
	 * Maps unicode characters from European languages to their ASCII 'equivalent'
	 *
	 * @param stringToMap the string to be mapped
	 * @return String
	 */
	static String mapUnicodeToAscii(String stringToMap) {
		int length = stringToMap.length();
		StringBuilder buf = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			char c = stringToMap.charAt(i);
			int pos = UNICODE.indexOf(c);
			if (pos > -1) {
				buf.append(PLAIN_ASCII.charAt(pos));
			} else {
				buf.append(c);
			}
		}

		return buf.toString();
	}
}
