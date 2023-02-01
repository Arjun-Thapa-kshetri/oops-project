import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LensFinder {
        public static void main(String[] args) {
                ArrayList<String> lens = new ArrayList<>();
                // a collection of lens
                lens.add("Sakura 35mm, f1.8");
                lens.add("Sakura 55mm, f1.8");
                lens.add("Sakura 85mm, f1.4");
                lens.add("Sakura 85mm, f1.8");
                lens.add("Sakura 24mm, f1.4");

                // Ask for an aperture value
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an aperture value: ");
                double aperture = scanner.nextDouble();
                System.out.println("Searching for lens with focal length: " + aperture);

                // Search for lens with the specified aperture value
                Iterator<String> iter = lens.iterator();
                boolean found = false;
                while (iter.hasNext()) {
                        String len = iter.next();
                        int index = len.indexOf('f');
                        String apertureStr = len.substring(index + 1);
                        double lensAperture = Double.parseDouble(apertureStr);
                        if (lensAperture == aperture) {
                                System.out.println("-> " + len);
                                found = true;
                        }
                }

                // Print a message if no matching lenses were found
                if (!found) {
                        System.out.println("No lens with a specified aperture has been found.");
                }
        }
}