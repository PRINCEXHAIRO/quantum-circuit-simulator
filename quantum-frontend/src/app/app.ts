import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { ChangeDetectorRef } from '@angular/core';

@Component({
  imports: [RouterOutlet],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  protected readonly title = signal('quantum-frontend');
  gates: string[] = [];
  errorMessage: string = '';

  addGate(gate: string) {
  this.gates = [...this.gates, gate];
   this.probabilities = [];
  }

  clearCircuit(){
    this.gates = []; 
     this.probabilities = [];
  }
  
  runSimulation() {
  this.errorMessage = '';

  this.http.post<number[]>(
    '/api/simulate',
    this.gates
  ).subscribe({
    next: (result) => {
      this.probabilities = result;
      this.cdr.markForCheck();
    },
    error: (err) => {
      this.probabilities = [];
      this.errorMessage = 'Simulation failed. Please try again.';
      console.error(err);
    }
  });
}
  constructor(
    private http: HttpClient,
    private cdr: ChangeDetectorRef) {}

  probabilities: number[] = [];


}
