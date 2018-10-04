package ads;


public class Quickfind {
    private int[] id;
    public Quickfind(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }
    
    public boolean connected(int id1, int id2) {
        return id[id1] == id[id2];
    }
    
    public void union(int id1, int id2) {
        int id_1 = id[id1];
        int id_2 = id[id2];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == id_1) id[i] = id_2; 
        }
    }
    
    public static void main(String[] args) {
        Quickfind q = new Quickfind(10);
        q.union(9, 0);
        q.union(3, 4);
        q.union(5, 8);
        q.union(7, 2);
        q.union(2, 1);
        q.union(5, 7);
        q.union(0, 3);
        q.union(4, 2);
        for (int i = 0; i < 10; i++) 
            System.out.print(q.id[i] + " ");
    }
}

