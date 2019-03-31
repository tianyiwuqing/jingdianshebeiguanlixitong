package toolsTest;

import org.junit.Test;

import java.util.Random;

/**
 * @author 天意无情
 * @date 2019-03-26 20:40
 */
public class UUIDTEST {

    @Test
    public void UUidTest() {
        String characters = "0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            // nextInt(10) = [0, 10)
            sb.append(characters.charAt(random.nextInt(10)));
        }
        System.out.println(sb.toString());
        }
    }

