package br.com.bidup.rotina;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class GerenteRotina {
    private boolean isRunning = false;

    private final ServiceRotinaContrato serviceRotinaContrato;

    public GerenteRotina(ServiceRotinaContrato serviceRotinaContrato) {
        this.serviceRotinaContrato = serviceRotinaContrato;
    }

    @Scheduled(initialDelay = 30000, fixedRate = Long.MAX_VALUE)
    public void executaCarga() throws InterruptedException {
        if (!isRunning){
            isRunning = true;
            serviceRotinaContrato.executaCarga();
        }
    }
}
