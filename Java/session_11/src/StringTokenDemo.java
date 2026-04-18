import java.util.StringTokenizer;

// Deprecated - now split is used
public class StringTokenDemo {
    public static void main(String[] args) {
        String str = "java=mayavi" + " mysql=rahul;";
        StringTokenizer st = new StringTokenizer(str, "=;");

        while (st.hasMoreTokens()) {
            String c = st.nextToken();
            String nm = st.nextToken();
            System.out.println(c + "=" + nm);
        }
    }
}
