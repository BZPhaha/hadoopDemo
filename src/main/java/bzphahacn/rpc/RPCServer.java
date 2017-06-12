package bzphahacn.rpc;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.hadoop.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.Server;

public class RPCServer implements RPCService{

	public static void main(String[] args) throws HadoopIllegalArgumentException, IOException {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		
		Server server = new RPC.Builder(conf)
						.setProtocol(RPCService.class)
						.setBindAddress("192.168.131.1")
						.setPort(9527)
						.setInstance(new RPCServer())
						.build();
		server.start();
	}

	public String sayHi(String name) {
		// TODO Auto-generated method stub
		return "Hi ~"+name;
	}

}
