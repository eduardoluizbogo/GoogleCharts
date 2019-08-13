package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Chart {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		final int SIZE = 4;
		int[] alunosturma = new int[SIZE];
		int numalunos;
		
		for (int i = 0; i < alunosturma.length; i++) {
			System.out.print("Insira o numero de alunos da turma "+(i+1)+": ");
			numalunos = entrada.nextInt();	
			
			alunosturma[i]= numalunos;
		}
		
		 FileWriter arq = new FileWriter("Chart.HTML");
		 
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		    gravarArq.printf("<html>\r\n" + 
		   	"  <head>\r\n" + 
		    	"    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n" + 
		   	"    <script type=\"text/javascript\">\r\n" + 
		 	"      google.charts.load('current', {'packages':['corechart']});\r\n" + 
		        "      google.charts.setOnLoadCallback(drawChart);\r\n" + 
		        "\r\n" + 
		        "      function drawChart() {\r\n" + 
		   	"\r\n" + 
		   	"        var data = google.visualization.arrayToDataTable([\r\n" + 
		   	"          ['Turmas', 'Notas'],\r\n" + 
		   	"          ['Alunos da turma 1',     "+alunosturma[0]+"],\r\n" + 
		   	"          ['Alunos da turma 2',     "+alunosturma[1]+"],\r\n" + 
		   	"          ['Alunos da turma 3',     "+alunosturma[2]+"],\r\n" + 
		   	"          ['Alunos da turma 4',     "+alunosturma[3]+"],\r\n" + 
		   	"        ]);\r\n" + 
		   	"\r\n" + 
		   	"        var options = {\r\n" + 
		   	"          pieHole: 0.5,\r\n" + 
		   	"          pieSliceTextStyle: {\r\n" + 
		   	"            color: 'black',\r\n" + 
		   	"          },\r\n" + 
		   	"          legend: 'Turmas'\r\n" + 
		   	"        };\r\n" + 
		   	"\r\n" + 
		   	"        var chart = new google.visualization.PieChart(document.getElementById('donut_single'));\r\n" + 
		   	"        chart.draw(data, options);\r\n" + 
		   	"      }\r\n" + 
		   	"    </script>\r\n" + 
		   	"  </head>\r\n" + 
		   	"  <body>\r\n" + 
		   	"    <div id=\"donut_single\" style=\"width: 900px; height: 500px;\"></div>\r\n" + 
		   	"  </body>\r\n" + 
		   	"</html>");
		    arq.close();
		    entrada.close();
	}
}
