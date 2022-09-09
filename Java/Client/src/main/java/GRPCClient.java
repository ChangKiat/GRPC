import com.user.grpc.User.APIResponse;
import com.user.grpc.User.LoginRequest;
import com.user.grpc.userGrpc;
import com.user.grpc.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		// stub -generate from proto
		userBlockingStub userStub =userGrpc.newBlockingStub(channel);
		LoginRequest request = LoginRequest.newBuilder().setUsername("TA").setPassword("TA").build();
		APIResponse response = userStub.login(request);
		
		System.out.println(response.getResponseMessage());

	}

}
