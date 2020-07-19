package advance;

import jdk.swing.interop.SwingInterOpUtils;

public class LearnEnum {

    public static void main(String[] args) {

        System.out.println(Color.RED);
        Color.colorInfo();
        System.out.println(Priority.HIGH);
        Priority.todaysDay();
    }
    public enum Priority{
        HIGH,LOW,MEDIUM;
        public static void todaysDay(){
            System.out.println("Todays days day id Saturday");
        }

    }
}
