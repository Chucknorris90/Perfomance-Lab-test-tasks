import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String[] args) throws IOException {
		
		Scanner file = new Scanner (new File(args[6]));
		String coords = file.nextLine();
		
		Pattern pattern = Pattern.compile("line.+?\\}");
	    Matcher m=pattern.matcher(coords);
	    System.out.println(m.find()? m.group():"I found nothing!");
	    String line = m.group();
	    
	    pattern = Pattern.compile("center.+?\\]");
	    m=pattern.matcher(coords);
	    if (m.find()) {m.group(); }
	    String cntr = m.group();
	  
	    pattern = Pattern.compile("radius.+?\\d+\\.\\d+");
	    m=pattern.matcher(coords);
	    if (m.find()) {m.group(); }
	    String rad = m.group();
		
	    pattern = Pattern.compile("\\d+\\.\\d+");
	    m=pattern.matcher(rad);
	    if (m.find()) {m.group(); }
	    String radius = m.group();
	    
	    pattern = Pattern.compile("[\\-[0-9]\\.]+");
	    m=pattern.matcher(cntr);
	    String [] centr = new String [3];
	    for (int i = 0; i < 3; i++) {
	    	if (m.find()) {
	    		centr[i]=cntr.substring(m.start(), m.end());	    		
	    	}
	    }
	
	    
		// Setting circle center & radius
        double cx = Double.parseDouble(centr[0]);
        double cy = Double.parseDouble(centr[1]);
        double cz = Double.parseDouble(centr[2]);
        
        double circleRadius = Double.parseDouble(radius);
        

        // Setting points of lines        
        
        double px = Double.parseDouble(args[0]);
        double py = Double.parseDouble(args[1]);
        double pz = Double.parseDouble(args[2]);

        double vx = Double.parseDouble(args[3]);
        double vy = Double.parseDouble(args[4]);
        double vz = Double.parseDouble(args[5]);
		
        double A = vx * vx + vy * vy + vz * vz;
        double B = 2.0 * (px * vx + py * vy + pz * vz - vx * cx - vy * cy - vz * cz);
        double C = px * px - 2 * px * cx + cx * cx + py * py - 2 * py * cy + cy * cy +
                   pz * pz - 2 * pz * cz + cz * cz - circleRadius * circleRadius;
        
        // discriminant
        double D = B * B - 4 * A * C;
        
        if ( D < 0 )
        {
            System.out.println("Коллизий не найдено");
        }

        double t1 = ( -B - Math.sqrt ( D ) ) / ( 2.0 * A );
        double t2 = ( -B + Math.sqrt ( D ) ) / ( 2.0 * A );

        double x1 = px * ( 1 - t1 ) + t1 * vx;
        double y1 = py * ( 1 - t1 ) + t1 * vy;
        double z1 = pz * ( 1 - t1 ) + t1 * vz;
        
        double x2 = px * ( 1 - t2 ) + t2 * vx;
        double y2 = py * ( 1 - t2 ) + t2 * vy;
        double z2 = pz * ( 1 - t2 ) + t2 * vz;
        
        if ( D == 0 )
        {
            System.out.println("Одна точка пересечения: Х="+x1+" ,Y="+y1+" ,Z="+z1);
            // the case when the line touches the sphere at one point
        }
        
        if ( D > 0 )
        {
        	if ( Math.abs( t1 - 0.5 ) < Math.abs( t2 - 0.5 ) )
            {
        		System.out.println("Две точки пересечения, первая: Х="+x1+" ,Y="+y1+" ,Z="+z1);
        		System.out.println("Вторая: Х="+x2+" ,Y="+y2+" ,Z="+z2);
            }
        	System.out.println("Две точки пересечения, первая: Х="+x1+" ,Y="+y1+" ,Z="+z1);
    		System.out.println("Вторая: Х="+x2+" ,Y="+y2+" ,Z="+z2);
        }

        
        
        
        

	}

}
