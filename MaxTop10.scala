
/*---------------------------------------------------------
* MaxTop10 : returns the max of 3 arrays (Nos. 3-10)
*/----------------------------------------------------------


/*

 input: 3 Integer arrays of varying sizes in sorted order.
 output: The max 10 elements across all 3 arrays

*/

import scala.math._


object MaxTop10 {
    
    
    var number=1
    
    def ipArray(arr:Array[Int]):Array[Int]=
    {
      
       
        val N=arr.length
        var array=new Array[Int](10)
        
        for(i <- 0 to N-1)
        {
           array(i)=arr(i)  
        }
        
        if(N<10)
        {
            for(i <- N to 9)
            array(i)=java.lang.Integer.MIN_VALUE
        }
        
        number+=1
        return array
    
    }
    
    def maxindex(a:Int,b:Int,c:Int):Int=
    {
        if(a>=b)
        {
            if(a>=c)
            {return 1}
            else
             return 3
        }
        else
        { if(b >= c)
             {return 2}
         else
             {return 3}
        }
        
    }
    
    
    
    def Maxtop10(arr1:Array[Int],arr2:Array[Int],arr3:Array[Int]): Array[Int] =
{

    
       
    
    var arr1ptr:Int=0
    var arr2ptr:Int=0
    var arr3ptr:Int=0
    var arryresult=new Array[Int](10)
    
    
    for(i <- 0 to 9)
    {
        
     var idx=maxindex(arr1(arr1ptr),arr2(arr2ptr),arr3(arr3ptr))
      
     if(idx==1)
     { arryresult(i)=arr1(arr1ptr)
       arr1ptr+=1
     }
     else if(idx==2)
     { arryresult(i)=arr2(arr2ptr)
       arr2ptr+=1
     }   
     else
     {
       arryresult(i)=arr3(arr3ptr)
       arr3ptr+=1  
     }   
    
         
        
    }
    
    
    
    return arryresult
 



}
    
    
    
    def main(args: Array[String]) =
    {
        
    // var N=scala.io.StdIn.readLine
        
        
        
        var array1=ipArray(Array(2,1))
        val array2=ipArray(Array(82,34,21,20,13,12,10,5,4,2,1))
        val array3=ipArray(Array(25,20,15,10,4,3,2,1))
        
        val arresultraw=Maxtop10(array1,array2,array3)
        val arresult=arresultraw.filter( _ != java.lang.Integer.MIN_VALUE )
        
        println("The resultant array is")
        print(arresult.mkString(" "))
               
     
     }
    
}
