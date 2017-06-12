package bzphahacn.hdfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

public class HDFSAPI {
	private FileSystem fileSystem = null;
	/*@Before
	public void init() throws Exception{
		Configuration conf = new Configuration();
		/*System.setProperty("HADOOP_USER_NAME", "root");
		conf.set("fs.defaultFS", "hdfs://bzphaha.cn:9000");
		fileSystem = FileSystem.get(conf);
		fileSystem = FileSystem.get(new URI("hdfs://bzphaha.cn:9000"), conf, "root");
	}
	
	@Test
	public void testUpload() throws Exception{
		//跟HDFS建立链接
		//打开本地文件系统的一个文件作为输入流
		InputStream in =new FileInputStream("f://chrome_35_0_1916_114.exe");
		//使用HDFS的fileSystem打开一个输出流
		FSDataOutputStream out = fileSystem.create(new Path("/test.exe"));
		//int ---> out
		IOUtils.copyBytes(in, out, 1024,true);
		
		//关闭fileSystem链接
		fileSystem.close();
	}

	@Test
	public void testMkdir() throws Exception{
		fileSystem.mkdirs(new Path("/a/b"));
		fileSystem.close();
	}
	
	@Test
	public void testDelete() throws IllegalArgumentException, IOException{
		boolean flat = fileSystem.delete(new Path("/user"), true);
		System.out.println(flat);
		fileSystem.close();
	}*/
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//和HDFS建立连接,要知道NameNode的地址
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://bzphaha.cn:9000");
		try {
			FileSystem fileSystem = FileSystem.get(conf);
			//打开一个输入流
			FSDataInputStream in = fileSystem.open(new Path("/jdk-8u121-linux-x64.tar.gz"));
			//打开一个本地的输出流文件
			OutputStream out = new FileOutputStream("f://a.gz");
			//拷贝IN--->OUT
			//关闭流
			IOUtils.copyBytes(in, out, 1024,true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
