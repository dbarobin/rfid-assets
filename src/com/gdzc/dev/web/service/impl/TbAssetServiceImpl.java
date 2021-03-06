package com.gdzc.dev.web.service.impl;

import java.util.List;

import com.gdzc.dev.web.dao.ITbAssetDao;
import com.gdzc.dev.web.dao.po.TbAsset;
import com.gdzc.dev.web.dao.po.TbAssetinfo;
import com.gdzc.dev.web.service.ITbAssetService;

public class TbAssetServiceImpl implements ITbAssetService {

	private ITbAssetDao tbAssetDao;

	/**
	 * 添加资产
	 * @author zjm
	 * @param tbAsset
	 * @throws Exception
	 */
	public void createAsset(TbAsset tbAsset)
	throws Exception {
		tbAssetDao.createAsset(tbAsset);
	}
	
	/**
	 * 根据资产ID查询资产
	 * @param tbAssetId
	 * @return
	 * @throws Exception
	 */
	public TbAsset queryAssetById(long tbAssetId)
	throws Exception {
		return tbAssetDao.queryAssetById(tbAssetId);
	}

	/**
	 * 通过资产信息ID查询资产
	 * @param tbAssetinfoId
	 * @return
	 * @throws Exception
	 */
	public List<TbAsset> queryAssetByAfoId(long tbAssetinfoId)
	throws Exception{
		return tbAssetDao.queryAssetByAfoId(tbAssetinfoId);
	}
	
	/**
	 * 通过资产信息ID分页查询资产
	 * @param tbAssetinfoId
	 * @param startRows
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<TbAsset> queryAssetByAfoId(long tbAssetinfoId, int startRows, int pageSize)
	throws Exception {
		return tbAssetDao.queryAssetByAfoId(tbAssetinfoId, startRows, pageSize);
	}
	
	/**
	 * 根据资产编码号查询资产
	 * @param tbAssetNumber
	 * @return
	 * @throws Exception
	 */
	public List<TbAsset> queryAssetByNumber(int startRows, int pageSize,String tbAssetNumber)
	throws Exception {
		return tbAssetDao.queryAssetByNumber(startRows, pageSize, tbAssetNumber);
	}

	/**
	 * 查询所有资产
	 * @return
	 * @throws Exception
	 */
	public List<TbAsset> queryAllAsset()
	throws Exception {
		return tbAssetDao.queryAllAsset();
	}
	
	/**
	 * 分页查询所有资产
	 * @param startRows
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<TbAsset> queryAllAsset(int startRows, int pageSize)
	throws Exception {
		return tbAssetDao.queryAllAsset(startRows, pageSize);
	}

	/**
	 * 根据资产ID删除资产
	 * @param tbAssetId
	 * @throws Exception
	 */
	public void deleteAssetById(long tbAssetId)
	throws Exception {
		tbAssetDao.deleteAssetById(tbAssetId);
	}
	
	
	/**
	 * 更新资产
	 * @param tbAsset
	 * @throws Exception
	 */
	public void updateAsset(TbAsset tbAsset)
	throws Exception {
		tbAssetDao.updateAsset(tbAsset);
	}
	
	/**
	 * 统计总共的资产数
	 * @return
	 * @throws Exception
	 */
	public int countAllAsset()
	throws Exception {
		return tbAssetDao.countAllAsset();
	}
	
	/**
	 * 通过资产信息ID统计资产总数
	 * @param tbAssetinfoId
	 * @return
	 * @throws Exception
	 */
	public int countAssetByAfoId(long tbAssetinfoId)
	throws Exception {
		return tbAssetDao.countAssetByAfoId(tbAssetinfoId);
	}
	
	/**
	 * 通过资产状态查询资产
	 * @param assetState
	 * @return
	 * @throws Exception
	 */
	public List<TbAsset> queryAssetByState(int startRows, int pageSize,String assetState) throws Exception{
		return this.tbAssetDao.queryAssetByState(startRows, pageSize, assetState);
	}
	
	
	/**
	 * 通过资产备注查询资产
	 * @param assetRemark
	 * @return
	 * @throws Exception
	 */
	public List<TbAsset> queryAssetByRemark(int startRows, int pageSize,String assetRemark) throws Exception{
		return this.tbAssetDao.queryAssetByRemark(startRows, pageSize, assetRemark);
	}
	
	/**
	 * 通过资产状态查询资产
	 * @param assetState
	 * @return
	 */
	public int countAllAssetByState(String assetState){
		return this.tbAssetDao.countAllAssetByState(assetState);
	}
	
	/**
	 * 通过资产状态备注资产
	 * @param assetState
	 * @return
	 */
	public int countAllAssetByRemark(String assetRemark){
		return this.getTbAssetDao().countAllAssetByRemark(assetRemark);
	}
	
	/**
	 * 通过资产编号查询资产记录数 -- 返回1 但为了分页效果 这个也要
	 * @param assetNumber
	 * @return
	 * @throws Exception
	 */
	public int countAssetByNumber(String assetNumber)throws Exception{
		return this.tbAssetDao.countAssetByNumber(assetNumber);
	}
	
	/*tbAssetDao的get&set方法*/
	public ITbAssetDao getTbAssetDao() {
		return tbAssetDao;
	}

	public void setTbAssetDao(ITbAssetDao tbAssetDao) {
		this.tbAssetDao = tbAssetDao;
	}
}
