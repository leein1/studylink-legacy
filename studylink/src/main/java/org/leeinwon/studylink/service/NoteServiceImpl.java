package org.leeinwon.studylink.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.leeinwon.studylink.domain.NoteVO;
import org.leeinwon.studylink.dto.NoteDTO;
import org.leeinwon.studylink.mapper.NoteMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService{

    private final NoteMapper noteMapper;

    private final ModelMapper modelMapper;

    @Override
    public void register(NoteDTO noteDTO) {

        log.info("노트 서비스 register 호출");

        NoteVO noteVO = modelMapper.map(noteDTO, NoteVO.class);

        log.info(noteDTO);

        noteMapper.insert(noteVO);
    }
}
