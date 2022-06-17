package io.nology.latviaspringcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/math")
public class MathController {
	
	@GetMapping(value = "/rectangle/perimeter/{height}/{width}")
	public Integer rectanglePerimeter(@PathVariable Integer height, @PathVariable Integer width) {
		return (height + width) * 2;
	}
	
	@GetMapping(value = "/circle/area/{r}")
	public Double circleArea(@PathVariable Double r) {
		return 3.14 * Math.pow(r, 2);
	}
}
