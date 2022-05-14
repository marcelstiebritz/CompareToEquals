import java.util.Objects;

public class Manager implements Comparable<Manager> {

    private int alter;
    private int gehalt;

    public Manager(int alter, int gehalt) {
        this.alter = alter;
        this.gehalt = gehalt;
    }

    public int getAlter() {
        return alter;
    }

    public int getGehalt() {
        return gehalt;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "alter=" + alter +
                ", gehalt=" + gehalt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null){
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Manager manager = (Manager) o;
        return alter == manager.alter && gehalt == manager.gehalt;
    }


    @Override
    public int compareTo(Manager o) {
        if (this.gehalt<o.getGehalt()){
            return -1;
        }else if (this.gehalt>o.getGehalt()){
            return 1;
        }else {
            return 0;
        }
    }
}
