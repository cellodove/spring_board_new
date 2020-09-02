package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO boardDAO;
	
	//게시물 목록
	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.list();
	}

	//게시물 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		boardDAO.write(boardVO);
		
	}

	//게시물 조회
	@Override
	public BoardVO view(int bno) throws Exception {
		return boardDAO.view(bno);
	}

	//게시물 수정
	@Override
	public void modify(BoardVO boardVO) throws Exception {
		boardDAO.modify(boardVO);
	}

	//게시물 삭제
	@Override
	public void delete(int bno) throws Exception {
		boardDAO.delete(bno);
	}

	@Override
	public int count() throws Exception {
		return boardDAO.count();
	}

	@Override
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception {
		return boardDAO.listPage(displayPost, postNum);
	}





}
