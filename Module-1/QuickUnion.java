package ads;

public class QuickUnion {
    private int[] id;

    public QuickUnion(int i) {
		// TODO Auto-generated constructor stub
	}

	public void QuickUnionUF(int N){
        id = new int [N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    private int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
    public static void main(String args[]) {
    	QuickUnion qs=new QuickUnion(10);
    	qs.QuickUnionUF(10);
    	qs.union(9, 0);
    	qs.union(3, 4);
    	qs.union(5, 8);
    	qs.union(7, 2);
    	qs.union(2, 1);
    	qs.union(5, 7);
    	qs.union(0, 3);
    	qs.union(4, 2);
    	for(int i=0;i<10;i++) {
    		System.out.print(qs.id[i]+" ");
    	}
    	
    }
}