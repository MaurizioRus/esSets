import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WeekDay{
    public static void main(String[] args) {
        Set<String> weekdaysHashSet = new HashSet<>();
        weekdaysHashSet.add("Monday");
        weekdaysHashSet.add("Tuesday");
        weekdaysHashSet.add("Wednesday");
        weekdaysHashSet.add("Thursday");
        weekdaysHashSet.add("Friday");
        weekdaysHashSet.add("Saturday");
        weekdaysHashSet.add("Sunday");

        System.out.println("HashSet of weekdays: " + weekdaysHashSet);

        Set<String> weekdaysLinkedHashSet = new LinkedHashSet<>();
        weekdaysLinkedHashSet.add("Monday");
        weekdaysLinkedHashSet.add("Tuesday");
        weekdaysLinkedHashSet.add("Wednesday");
        weekdaysLinkedHashSet.add("Thursday");
        weekdaysLinkedHashSet.add("Friday");
        weekdaysLinkedHashSet.add("Saturday");
        weekdaysLinkedHashSet.add("Sunday");

        System.out.println("LinkedHashSet of weekdays: " + weekdaysLinkedHashSet);

        boolean isEqual = weekdaysHashSet.equals(weekdaysLinkedHashSet);
        System.out.println("Are the two Sets equal? " + isEqual);
    }
}

