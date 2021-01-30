import java.util.Scanner;

public class Sort {
    public static void bubbleSort(int[] a){
        int temp;
        for(int i=0;i<a.length-1;i++)
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
    }

    public  static  void Merge(int[] a,int[] b,int[] c){
        int lena=a.length, lenb=b.length;
        int i=0,j=0,k=0;
        while(i<lena && j<lenb)
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                i++;
            }
            else
            {
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==lena)
        {
            while(j<lenb)
            {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==lenb)
        {
            while(i<lena)
            {
                c[k]=a[i];
                i++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串数字：");
        String str = sc.next().toString();
        String[] arr = str.split(",");
        int[] a = new  int[arr.length];
        for(int i=0; i< arr.length; i++)
        {
            a[i]=Integer.parseInt(arr[i]);
        }
        bubbleSort(a);
        System.out.println("排序后的结果：");
        for(int i=0; i< arr.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");

        System.out.println("请输入另一串数字：");
        String str1 = sc.next().toString();
        String[] brr = str1.split(",");
        int[] b = new  int[brr.length];
        for(int i=0; i< brr.length; i++)
        {
            b[i]=Integer.parseInt(brr[i]);
        }
        bubbleSort(b);

        int[] c=new int[a.length+b.length];
        Merge(a,b,c);
        System.out.println("合并后的结果：");
        for(int i=0; i< arr.length+ brr.length; i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}