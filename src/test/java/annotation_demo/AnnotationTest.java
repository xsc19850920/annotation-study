package annotation_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.genpact.demo.Group;
import com.genpact.demo.model.Model;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring.xml")
public class AnnotationTest {
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	private static Validator validator;  
	

	@Test
	public void test() {
		try {
			Model model = new Model( format.parse("2016-09-20"), 1);
			System.out.println(model.toString());
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			validator = factory.getValidator();
			Set<ConstraintViolation<Model>> s = validator.validate(model, Group.class);
			System.out.println("------------"+s.size());
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
