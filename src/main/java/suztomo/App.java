package suztomo;

import com.google.cloud.bigtable.data.v2.models.Range;
import com.google.protobuf.ByteString;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Range.ByteStringRange.prefix("foo");        
    }
}
