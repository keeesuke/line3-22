import java.util.Calendar;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
		}

    Calendar cal = Calendar.getInstance();

    int month = cal.get(Calendar.MONTH) + 1;
    int day = cal.get(Calendar.DATE);

    System.out.println("今日は" + month + "月" + day + "です");
	}
}
