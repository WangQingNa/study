import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author yangfuzhao on 2021/11/11.
 */
public class FlieUilt {
    public static void main(String[] args) {

        File file = new File("/tmp/chks/flinkcdc");
        final Comparator<File> comparator = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return Long.valueOf(o1.lastModified()).compareTo(Long.valueOf(o1.lastModified()));
            }
        };

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            Optional<File> max = Arrays.stream(files).max((f1, f2) -> comparator.compare(f1, f2));
            File lastFile = max.get();
            String absolutePath1 = Arrays.stream(lastFile.listFiles()).filter(name -> name.getName().startsWith("chk-")).max((f11, f21) -> comparator.compare(f11, f21)).get().getAbsolutePath();
            System.out.println("file1:" + absolutePath1);
        }
    }
}
