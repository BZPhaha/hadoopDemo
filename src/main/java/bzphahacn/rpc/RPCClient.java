package bzphahacn.rpc;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class RPCClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		String host = args[0];
		int port = Integer.parseInt(args[1]);
		//在客户端获取代理对象，有了代理对象就可以调用目标对象（Server上的方法）的方法
		RPCService proxy = RPC.getProxy(RPCService.class, 10010, new InetSocketAddress(host,port), conf);
		String result = proxy.sayHi("bzp");
		System.out.println(result);
		RPC.stopProxy(proxy);
	}

}
