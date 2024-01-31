public class dipgm {
public static void main(String[] args) {
Scanner sc=new

Scanner(System.in);

int n=sc.nextInt();
int a[]=new int[n];
int count=0,i,g=0;
for( i=0;i&lt;a.length;i++){
a[i]=sc.nextInt();
//System.out.println(a[i]);
}
for(i=0;i&lt;a.length;i++){

if(a[i]&lt;0 || a[i]==0){
count++;
}

}

if(count==n){
System.out.println(&quot;0&quot;);
}
for(i=0;i&lt;a.length;i++){
for(int j=i+1;j&lt;a.length;j++){
if(a[i]==a[j] &amp;&amp; a[i]&gt;0){

System.out.println(a[i]);
g++;
System.exit(0);
}
/*else if(a[i]!=a[j]){

System.out.println(a[0]);

break aa;*/
}

}
for(i=0;i&lt;a.length;i++)
{
if(g==0 &amp;&amp; count&lt;n &amp;&amp; a[i]&gt;0)
{
System.out.println(a[i]);
System.exit(0);
}
}
}
}
}
