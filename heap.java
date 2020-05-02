package classes;
import java.util.*;
public class heap {
	ArrayList<Integer> heap=new ArrayList<>();
	public void add(int i) {
	heap.add(i);
	upheapify(heap.size()-1);
	}
	private void upheapify(int lp)
	{
		if(this.heap.get(lp)<this.heap.get((lp-1)/2))
		{
			 
			swap(lp,(lp-1)/2);
			upheapify((lp-1)/2);
		}
		else
			return;
	}
	private void swap(int i,int j)
	{
		 int t=this.heap.get(i);
		 int k=this.heap.get(j);
		 this.heap.remove(i);
		 this.heap.add(i, k);
		 this.heap.remove(j);
		 this.heap.add(j, t);
	}
	public int remove()
	{
		swap(0,this.heap.size()-1);
		int rv=this.heap.get(this.heap.size()-1);
		this.heap.remove(this.heap.size()-1);
		downheapify(0);
		return rv;
	}
	private void downheapify(int root)
	{
		int lc=2*root+1;
		int rc=2*root+2;
		int min=root;
		if(lc<this.heap.size() && this.heap.get(min)>this.heap.get(lc))
			min=lc;
		if(rc<this.heap.size() && this.heap.get(min)>this.heap.get(rc))
			min=rc;
		if(min!=root) {
			swap(min,root);
		    downheapify(min);}
		}
	public void display()
	{
		System.out.println(heap);
	}

}
