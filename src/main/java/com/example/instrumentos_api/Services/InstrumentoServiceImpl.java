package com.example.instrumentos_api.Services;

import com.example.instrumentos_api.Entities.Instrumento;
import com.example.instrumentos_api.Repositories.InstrumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentoServiceImpl implements InstrumentoService {

    @Autowired
    private InstrumentoRepository instrumentoRepository;

    @Override
    public List<Instrumento> getAllInstrumentos() {
        return instrumentoRepository.findAll();
    }

    @Override
    public Instrumento getInstrumentoById(Long id) {
        return instrumentoRepository.findById(id).orElse(null);
    }

    @Override
    public Instrumento saveInstrumento(Instrumento instrumento) {
        return instrumentoRepository.save(instrumento);
    }

    @Override
    public void deleteInstrumento(Long id) {
        instrumentoRepository.deleteById(id);
    }

    @Override
    public Iterable<Instrumento> saveAll(List<Instrumento> instrumentos) {
        return instrumentoRepository.saveAll(instrumentos);
    }
}
