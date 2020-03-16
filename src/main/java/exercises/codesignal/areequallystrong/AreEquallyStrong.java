package exercises.codesignal.areequallystrong;

import java.util.List;

public class AreEquallyStrong {

    public boolean areEquallyString(int yourLeft, int yourRight,
                                    int friendsLeft, int friendsRight) {
        Person you = new Person(yourLeft, yourRight);
        Person friend = new Person(friendsLeft, friendsRight);

        return you.areEquallyStrong(friend);
    }

    private static class Person {

        private int leftArm;
        private int rightArm;

        public List<Integer> getArms() {
            return List.of(this.leftArm, this.rightArm);
        }

        public Person(int leftArm, int rightArm) {
            this.rightArm = rightArm;
            this.leftArm = leftArm;
        }

        public boolean areEquallyStrong(Person person) {
            List<Integer> friendArms = person.getArms();

            for (Integer arm : friendArms) {
                if (this.getArms().stream().noneMatch(a -> a.equals(arm))) {
                    return false;
                }
            }
            return true;
        }
    }
}
