package org.adaitw.tpfinal.service.impl;

import org.adaitw.tpfinal.model.dto.Concepto;
import org.adaitw.tpfinal.model.entity.ConceptoEntity;
import org.adaitw.tpfinal.model.repository.ConceptoRepository;
import org.adaitw.tpfinal.service.ConceptoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConceptoServiceImpl implements ConceptoService {

    @Autowired
    ConceptoRepository conceptoRepository;

    @Override
    public List<Concepto> findAllConceptos() {
        List<ConceptoEntity> conceptoEntityList = conceptoRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        List<Concepto> conceptoList = new ArrayList<>();
        for (ConceptoEntity concepto : conceptoEntityList){
            Concepto conceptoLista = modelMapper.map(concepto, Concepto.class);
            conceptoLista.setIdConcepto((long) concepto.getIdConcepto());
            conceptoLista.setNumeroConcepto(concepto.getNumeroConcepto());
            conceptoLista.setNombreConcepto(concepto.getNombreConcepto());
            conceptoLista.setContenidoConcepto(concepto.getContenidoConcepto());
            conceptoList.add(conceptoLista);
        } return conceptoList;
    }

    @Override
    public String crearConcepto(Concepto concepto) {
        ConceptoEntity conceptoNuevo;
        ModelMapper modelMapper = new ModelMapper();
        conceptoNuevo = modelMapper.map(concepto, ConceptoEntity.class);
        conceptoRepository.save(conceptoNuevo);
        return "Se ha guardado exitosamente un nuevo concepto";
    }

    @Override
    public String eliminarConcepto(Long id) {
           if (conceptoRepository.findById(id).isPresent()) {
                conceptoRepository.deleteById(id);
                return "Se ha eliminado exitosamente el concepto.";
            }
           return "Concepto no encontrado.";
    }

    @Override
    public String actualizarConcepto(Concepto conceptoActualizado) {
        Long num = conceptoActualizado.getIdConcepto();
        if (conceptoRepository.findById(num).isPresent()) {
            ConceptoEntity conceptoParaActualizar = new ConceptoEntity();
            conceptoParaActualizar.setIdConcepto(conceptoParaActualizar.getIdConcepto());
            conceptoParaActualizar.setNombreConcepto(conceptoParaActualizar.getNombreConcepto());
            conceptoParaActualizar.setContenidoConcepto (conceptoParaActualizar.getContenidoConcepto());
            conceptoParaActualizar.setNumeroConcepto(conceptoParaActualizar.getNumeroConcepto());
            conceptoRepository.save(conceptoParaActualizar);
            return "Concepto actualizado exitosamente";
        }
        return "Error al modificar el concepto";
    }


}
