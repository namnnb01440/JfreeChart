/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JchartTest;

import com.opensymphony.xwork2.ActionSupport;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author viet cuong
 */
public class JfreeChartAction extends ActionSupport {

    private JFreeChart chart;

    @Override
    public String execute() throws Exception {

        DefaultPieDataset dataSet = new DefaultPieDataset();
        dataSet.setValue("Agriculture", 10);
        dataSet.setValue("Residential heating", 4);
        dataSet.setValue("Commercial products", 15);
        dataSet.setValue("Industry", 42);
        dataSet.setValue("Transportation", 26);
        dataSet.setValue("Others", 3);

        chart = ChartFactory.createPieChart(
                "Source of Air Pollution ", // Title
                dataSet, // Data
                true, // Display the legend
                true, // Display tool tips
                false // No URLs
        );

        chart.setBorderVisible(true);

        return SUCCESS;
    }

    // This method will get called if we specify <param name="value">chart</param>
    public JFreeChart getChart() {
        return chart;
    }
}
