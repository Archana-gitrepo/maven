package stringBuffer;

public class Insert {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb.insert(0, "Hello "));
        System.out.println(sb.insert(1, "hi "));
        System.out.println(sb.insert(2, "bye "));
        System.out.println(sb.insert(3, "thankU "));

        System.out.println(sb);
	}

}
