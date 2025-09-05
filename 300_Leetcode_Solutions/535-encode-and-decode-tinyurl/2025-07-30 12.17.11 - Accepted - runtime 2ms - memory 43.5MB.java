public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb=new StringBuilder();
        for(char c:longUrl.toCharArray())
        {
            sb.append((char)(c+1));
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder sb=new StringBuilder();
        for(char k:shortUrl.toCharArray())
        {
            sb.append((char)(k-1));
        }
        return sb.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));