package last;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{

	public void sound() {
	System.out.println("ROARRRRRRRRRRRRRRRRR");
	}

}
