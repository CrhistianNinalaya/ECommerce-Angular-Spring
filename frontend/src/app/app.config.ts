import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';
import { HttpClient, provideHttpClient ,withFetch} from '@angular/common/http';

export const appConfig: ApplicationConfig = {
  providers: [
    provideZoneChangeDetection({ eventCoalescing: true }),
    provideRouter(routes),
    provideClientHydration(),

    // Para solucionar error NG02801: 'httpClient no configurado para usar fetch'. Se debe importar el modulo HttpClient y withFetch
    // y agregar provideHttpClient(withFetch()) en el array de providers
    provideHttpClient(withFetch())
  ]
};