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

	@Override
	public BoardVO view(int bno) throws Exception {
		return boardDAO.view(bno);
	}

}
