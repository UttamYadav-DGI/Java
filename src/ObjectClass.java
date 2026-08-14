
// Every Java class directly or indirectly extends Object.
//Object
//│
//        ├── toString()      → "What does this object look like?"
//        │
//        ├── equals()        → "Are these objects logically equal?"
//        │
//        ├── hashCode()      → "What hash value represents this object?"
//        │
//        ├── getClass()      → "What class is this object?"
//        │
//        ├── clone()         → "Can I create a copy?"
//        │
//        ├── wait()          → "Make this thread wait"
//        │
//        ├── notify()        → "Wake one waiting thread"
//        │
//        └── notifyAll()     → "Wake all waiting threads"


class Studentss {

    private final int rollNo;
    private final String name;

    public Studentss(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;

        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNo);
    }
}
public class ObjectClass {
    public static void main(String[] args)
    {
        Studentss s1 = new Studentss(101, "Uttam");
        Studentss s2 = new Studentss(101, "Uttam");
    }
}
