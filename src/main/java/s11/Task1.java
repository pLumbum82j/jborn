package s11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Есть класс User(firstname:String, secondname: String). Написать метод,
 * на вход которому приходит список User, требуется отсортировать этот список
 * сначала по фамилии, а потом по имени. В этой задаче вам предстоит
 * разобраться с интерфейсом Comparator.
 */
public class Task1 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        user1.setFirstName("Шамиль");
        user1.setSecondName("Волков");
        user2.setFirstName("Илья");
        user2.setSecondName("Смирнов");
        user3.setFirstName("Анастасия");
        user3.setSecondName("Смирнова");
        user4.setFirstName("Екатерина");
        user4.setSecondName("Смирнова");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        System.out.println(users);
        users.sort(new userComparator());
        System.out.println(users);
    }
}

class userComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int flag = o1.getSecondName().compareTo(o2.getSecondName());
        if (flag == 1){
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
        return flag;
    }
}
