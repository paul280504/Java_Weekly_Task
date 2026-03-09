package com.kovanlabsintern.javaweektask.GenericsWildcards;

class MyStack<T>
{
    private T data;
    private int curcapacity = 4;
    private int i = 0;

    Object[] obj  = new Object[curcapacity];
    public void add(T data)
    {
        if(i>=0.75*curcapacity)
        {
            resize();
        }
        this.data=data;
        obj[i]=this.data;
        i++;
    }
    @SuppressWarnings("unchecked")
    public T get(int index)
    {
        return (T) obj[index];
    }
    void resize()
    {
        curcapacity += 4;
        Object[] newobj  = new Object[curcapacity];
        for(int j=0;j<i;j++)
        {
            newobj[j]=obj[j];
        }
        obj=newobj;
    }
    public int getCurcapacity()
    {
        return this.curcapacity;
    }

}
public class GenericStack {
    public static void main(String[] args) {

        MyStack<Integer> ms = new MyStack<>();
        ms.add(5);
        ms.add(6);
        ms.add(7);
        ms.add(8);
        ms.add(9);
        ms.add(10);
        ms.add(11);
        System.out.println(ms.get(6));
        System.out.println(ms.getCurcapacity());

    }
}
