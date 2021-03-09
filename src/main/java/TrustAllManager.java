import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

class TrustAllManager implements X509TrustManager {

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {  // Noncompliant, nothing means trust any client
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException { // Noncompliant, this method never throws exception, it means trust any server
        System.out.println("bad");
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}