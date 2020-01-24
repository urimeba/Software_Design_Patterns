using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace observadorConexion
{
    public partial class SujetoConcreto : Form
    {
        public SujetoConcreto()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.txtConsulta.Enabled = true;
            this.acti();
            
        }

        private void SujetoConcreto_Load(object sender, EventArgs e)
        {
            this.txtConsulta.Enabled = false;
        }

        private void btnDesconectar_Click(object sender, EventArgs e)
        {
            this.txtConsulta.Enabled = false;
            this.des();
            
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            this.cadena = this.txtConsulta.Text;
            this.notificar();
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            ObservadorConcreto ventana = new ObservadorConcreto();
            ventana.actualizar(this.cadena);
            this.addObservador(ventana);
            ventana.Show();
        }

        private void txtConexion_Click(object sender, EventArgs e)
        {

        }
    }
}
