package models	;

import java.util.*;
import 	play.db.jpa.*;
import javax.persistence.*;

@Entity
public class Feedback extends Model  {

		public String name;
		public String mailId;
		public String feedback;
		
		@ManyToOne
		public AllArticles articleId;

		
}
