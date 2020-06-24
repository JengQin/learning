import java.net.URI;
import java.net.URISyntaxException;

public class Test {
    public static void main(String[] args) throws URISyntaxException {
        String url1 = "spark://YarnScheduler@dc_hadoop_task2:42961";
        URI uri1 = new URI((url1));
        String host1 = uri1.getHost();
        int port1 = uri1.getPort();
        String name1 = uri1.getUserInfo();
        System.out.println("uri1.getScheme:" + uri1.getScheme());
        System.out.println("uri1.getPath:" + uri1.getPath());
        System.out.println("uri1.getPath.isEmpty:" + uri1.getPath().isEmpty());
        System.out.println("uri1.getFragment:" + uri1.getFragment());
        System.out.println("uri1.getQuery:" + uri1.getQuery());
        System.out.println("host1:" + host1 + ", port1:" + port1 + ", name1:" + name1);

        System.out.println("=----------------");
        String url2 = "spark://YarnScheduler@dc-hadoop-task2:42961";
        URI uri2 = new URI((url2));
        String host2 = uri1.getHost();
        int port2 = uri1.getPort();
        String name2 = uri1.getUserInfo();
        System.out.println("uri.getScheme:" + uri2.getScheme());
        System.out.println("uri2.getPath:" + uri2.getPath());
        System.out.println("uri2.getPath.isEmpty:" + uri2.getPath().isEmpty());
        System.out.println("uri2.getFragment:" + uri2.getFragment());
        System.out.println("uri2.getQuery:" + uri2.getQuery());
        System.out.println("host2:" + host2 + ", port2:" + port2 + ", name2:" + name2);
    }
}
