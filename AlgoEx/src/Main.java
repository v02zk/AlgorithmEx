import com.sun.deploy.util.ArrayUtil;
import org.omg.PortableInterceptor.SUCCESSFUL;

import java.net.SocketTimeoutException;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws SocketTimeoutException {
        int[] test = {1, 5, 11, 5};
        int[][] test1 = {{1,0,1},{0,-2,3}};
        int[] test2 = {1,10,4,11};
        char[] test3 = {'A','A','A','A','A','A','B','C','D','E','F','G'};
        char[][] test4 = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        Interval[] intervals = {new Interval(2,6),new Interval(1,3),new Interval(8,10),new Interval(15,18)};
        Interval[] intervals1 = {new Interval(1,4),new Interval(2,3)};
        String s = "";
        String s1 = "*";
        String s2 = "aabdbadc";
        String t = 12 + "-" + 1;
        s2.substring(0,0);
        String[] words = {"aaaa","aaa","aa"};
        List<String> wordDict = Arrays.asList(words);
        System.out.println("Integer max " + (Integer.MAX_VALUE + 1));
        Stack<Integer> tt = new Stack<>();
        tt.toArray(new Integer[2]);
        PriorityQueue<Integer> taskF = new PriorityQueue<>((a, b)-> b - a);
        taskF.offer(2);
        taskF.offer(1);
        Queue<Integer> queue = new LinkedList<>();

        WildcardMatching wildcardMatching = new WildcardMatching();
        wildcardMatching.isMatch(s, s1);

        Arrays.sort(test1, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
    }

    private static int binarySearch(List<Integer> list, int t){
        int low = 0, high = list.size() - 1, mid;
        while (low <= high){
            mid = (low + high) / 2;
            if(list.get(mid) <= t){
                low = mid + 1;
            }else if(list.get(mid) > t){
                high = mid - 1;
            }
        }
        return low;
    }

    private void testGeneral(){
        T tt = (T)getAttachDataByClsByNew(T.class);
    }

    public Object getAttachDataByClsByNew(Class clz) {
        Object o = null;
        try {
            o = clz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    }

    private static void test(){
//        TreeSet<T> treeSet = new TreeSet<>(new TComparator());
//        treeSet.add(new T(3));
//        treeSet.add(new T(2));
//        treeSet.add(new T(2));
//        treeSet.add(new T(2));
//        treeSet.add(new T(1));
//        treeSet.add(new T(4));
//        System.out.println(1);

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);

        for (Integer i : list){
            if(i.equals(1)){
                list.remove(i);
            }
            System.out.println("list   :" + i);
        }

    }

    private void test1(){
        Base t = new T(1);
        Inter inter = (Inter)t;
        inter.outPut("this is can be done");

        List<T> list = new ArrayList<>();
        list.add(new T(1));
        list.add(new T(2));

        List<T> list2 = new ArrayList<>();
        list2.addAll(list);

        list.remove(0);
        System.out.println("");
    }


    class T extends Base implements Inter{
        int id;

        public T(int id){
            this.id = id;
        }

        @Override
        public void outPut(String s) {
            System.out.println(s);
        }
    }

    class Base{

    }

    interface Inter{
        void outPut(String s);
    }

    class TComparator implements Comparator<T>{
        @Override
        public int compare(T o1, T o2) {
            return o1.id - o2.id >= 0 ? 1 : -1;
        }
    }


}
