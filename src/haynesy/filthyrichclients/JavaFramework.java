package haynesy.filthyrichclients;

/**
 * Created with IntelliJ IDEA.
 * User: Haynesy
 * Date: 29/05/12
 * Time: 8:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class JavaFramework {
    public static void Play() {
        PlayWithStringHandling();
    }

    private static void PlayWithStringHandling() {
        /**
        String str = new String();

        char chars[] = { 'a', 'b', 'c', '1', '2', '3'};

        String result = new String(chars);
        System.out.println(result);

        System.out.println("");
        String resultTwo = new String(chars, 2, 2);
        System.out.println(resultTwo);

        System.out.println("");
        String resultThree = new String(resultTwo);
        System.out.println(resultThree);

        System.out.println("");
        System.out.println("Woot".length());
        System.out.println("Foo".toLowerCase().toCharArray());

        System.out.println("");
        System.out.println("Foo" == "foo");
        System.out.println("Foo".equalsIgnoreCase("foo"));

        System.out.println("");
        System.out.println("IWasBornIn1980".startsWith("foo"));
        System.out.println("IWasBornIn1980".startsWith("IWa"));
        System.out.println("IWasBornIn1980".endsWith("IWa"));
        System.out.println("IWasBornIn1980".endsWith("980"));

        System.out.println("");
        System.out.println("Foo".compareToIgnoreCase("foo"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "Fooo";
        try {
            line = br.readLine();
        } catch (IOException e) {
            System.out.println("Oh Shit!");
        }
        System.out.println(line);
        **/
        System.out.println("Buffers:");

        StringBuffer buf = new StringBuffer("Woot");
        System.out.println(buf.length());
        System.out.println(buf.capacity());

        System.out.println("");


    }
}
