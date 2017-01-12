/*-----------------------------------------------
* SequenceRecordParser: adds sequence number to records
*/-----------------------------------------------

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import java.io._



Object SequenceRecordParser
{

 def loadData(sc:SparkContext): RDD[String] = {
    
    val pathToFile = "data/customer.csv"
    val recwithhdrrdd=sc.textFile(pathToFile)
      
    val header = data.first() 
    val datardd = data.filter(row => row != header)    
    return datardd

 }


def main(args:Array[String])
{

 val conf = new SparkConf()
                        .setAppName("SequenceRecordParser")
                        .setMaster("local[*]")

 val sc = new SparkContext(conf)
 val inputdata=loadData(sc)
 val IDrdd=sc.parallelize(List.range(1,inputdata.count+1))
 val recRDD=inputdata.zip(IDrdd)
 
 //save data
 

}


}
