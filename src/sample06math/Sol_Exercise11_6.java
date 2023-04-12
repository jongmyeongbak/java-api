package sample06math;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Student6 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student6(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage()
                ;
    }

    public int compareTo(Object o) {
        if (o instanceof Student6) {
            Student6 tmp = (Student6) o;

            return name.compareTo(tmp.name);
        } else {
            return -1;
        }
    }
} // class Student

class Sol_Exercise11_6 {
    static SortedSet getGroupCount(TreeSet tset, int from, int to) {
    /*
    (1)	알맞은 코드를 넣어 완성하시오.
    */
        //🔥 tset에 담긴 Student 객체 값들의 평균을 꺼내와 집합에 저장한다.
        //🔥 Set을 참조변수의 타입으로 선언하면 안된다. subSet()으로 범위 탐색할 것이기 때문.
        TreeSet avgSet = new TreeSet();
        Iterator it = tset.iterator();
        while(it.hasNext()) {
        	Object obj = it.next();
            if(obj instanceof Student6) {
                Student6 tmp = (Student6) obj;
                avgSet.add(tmp.getAverage());
            }
        }

        //🔥 범위 검색이므로 tset.subSet(int from, int to)를 활용한다.
        //🔥 그것의 사이즈를 반환하면 되는 것이다.
        return avgSet.subSet(from, to);
            
    }

    public static void main(String[] args) {
        //🔥 익명클래스로 Comparator 인스턴스 구현!
        TreeSet set = new TreeSet(new Comparator() {
            public int compare(Object o1, Object o2) {
            /*
            (2)	알맞은 코드를 넣어 완성하시오.
            */
                if (o1 instanceof Student6 && o2 instanceof Student6) {
                    Student6 s1 = (Student6) o1;
                    Student6 s2 = (Student6) o2;
                    //🔥 3항 연산자 사용하여 평균값을 기준으로 정렬하기
                    return s1.getAverage() > s2.getAverage() ? 1 : (s1.getAverage() == s2.getAverage() ? 0 : -1);
                } else return -1;
            }
        });

        set.add(new Student6("홍길동", 1, 1, 100, 100, 100));
        set.add(new Student6("남궁성", 1, 2, 90, 70, 80));
//        set.add(new Student6("김자바", 1, 3, 80, 80, 90));
//        set.add(new Student6("이자바", 1, 4, 70, 90, 70));
//        set.add(new Student6("안자바", 1, 5, 60, 100, 80));
        Iterator it = set.iterator();
        while (it.hasNext()) System.out.println(it.next());

        System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
        System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
        System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
        System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
    }
}
