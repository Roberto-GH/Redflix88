package com.G3M4E5.Redflix88;

import com.G3M4E5.Redflix88.vista.Ventana;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.G3M4E5.Redflix88")
public class Redflix88Application {

	public static void main(String[] args) {		
                new Ventana().setVisible(true);
	}
        
        public static void runSpring() {
            SpringApplication.run(Redflix88Application.class);
        }

}
