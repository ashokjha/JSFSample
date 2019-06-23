/**
 * 
 */
package poc.web.jsf.prj.dao;

import java.util.List;

import poc.web.jsf.prj.entity.SampleData;


/**
 * @author Ashok Kumar Jha
 *
 */
public interface ISampleDataDao {


        /**
         * Add SampleData
         *
         * @param SampleData sampleData
         */
        public void addSampleData(SampleData sampleData);

        /**
         * Update SampleData
         *
         * @param SampleData sampleData
         */
        public void updateSampleData(SampleData sampleData);

        /**
         * Delete SampleData
         *
         * @param SampleData sampleData
         */
        public void deleteSampleData(SampleData sampleData);

        /**
         * Get SampleData
         *
         * @param int SampleData sampleData Id
         */
        public SampleData getSampleDataById(int id);

        /**
         * Get SampleData List
         *
         */
        public List<SampleData> getSampleDatas();
}
