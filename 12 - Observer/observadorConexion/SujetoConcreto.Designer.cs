using System.Collections;

namespace observadorConexion
{
    partial class SujetoConcreto
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        private string cadena = null;
        ArrayList observadores = new ArrayList();

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.txtConexion = new System.Windows.Forms.Label();
            this.btnConectar = new System.Windows.Forms.Button();
            this.btnConsulta = new System.Windows.Forms.Button();
            this.btnDesconectar = new System.Windows.Forms.Button();
            this.txtConsulta = new System.Windows.Forms.TextBox();
            this.btnInstancia = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // txtConexion
            // 
            this.txtConexion.AutoSize = true;
            this.txtConexion.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtConexion.Location = new System.Drawing.Point(189, 52);
            this.txtConexion.Name = "txtConexion";
            this.txtConexion.Size = new System.Drawing.Size(115, 29);
            this.txtConexion.TabIndex = 0;
            this.txtConexion.Text = "Conexion";
            this.txtConexion.Click += new System.EventHandler(this.txtConexion_Click);
            // 
            // btnConectar
            // 
            this.btnConectar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnConectar.Location = new System.Drawing.Point(50, 113);
            this.btnConectar.Name = "btnConectar";
            this.btnConectar.Size = new System.Drawing.Size(114, 58);
            this.btnConectar.TabIndex = 1;
            this.btnConectar.Text = "Conectar";
            this.btnConectar.UseVisualStyleBackColor = true;
            this.btnConectar.Click += new System.EventHandler(this.button1_Click);
            // 
            // btnConsulta
            // 
            this.btnConsulta.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnConsulta.Location = new System.Drawing.Point(190, 112);
            this.btnConsulta.Name = "btnConsulta";
            this.btnConsulta.Size = new System.Drawing.Size(114, 59);
            this.btnConsulta.TabIndex = 2;
            this.btnConsulta.Text = "Ejecutar Consulta";
            this.btnConsulta.UseVisualStyleBackColor = true;
            // 
            // btnDesconectar
            // 
            this.btnDesconectar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDesconectar.Location = new System.Drawing.Point(333, 112);
            this.btnDesconectar.Name = "btnDesconectar";
            this.btnDesconectar.Size = new System.Drawing.Size(114, 58);
            this.btnDesconectar.TabIndex = 3;
            this.btnDesconectar.Text = "Desconectar";
            this.btnDesconectar.UseVisualStyleBackColor = true;
            this.btnDesconectar.Click += new System.EventHandler(this.btnDesconectar_Click);
            // 
            // txtConsulta
            // 
            this.txtConsulta.Font = new System.Drawing.Font("Microsoft Sans Serif", 14F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtConsulta.Location = new System.Drawing.Point(48, 201);
            this.txtConsulta.Name = "txtConsulta";
            this.txtConsulta.Size = new System.Drawing.Size(397, 29);
            this.txtConsulta.TabIndex = 4;
            this.txtConsulta.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // btnInstancia
            // 
            this.btnInstancia.Location = new System.Drawing.Point(190, 271);
            this.btnInstancia.Name = "btnInstancia";
            this.btnInstancia.Size = new System.Drawing.Size(129, 23);
            this.btnInstancia.TabIndex = 5;
            this.btnInstancia.Text = "Crear Instancia";
            this.btnInstancia.UseVisualStyleBackColor = true;
            this.btnInstancia.Click += new System.EventHandler(this.button1_Click_1);
            // 
            // SujetoConcreto
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(478, 323);
            this.Controls.Add(this.btnInstancia);
            this.Controls.Add(this.txtConsulta);
            this.Controls.Add(this.btnDesconectar);
            this.Controls.Add(this.btnConsulta);
            this.Controls.Add(this.btnConectar);
            this.Controls.Add(this.txtConexion);
            this.Name = "SujetoConcreto";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.SujetoConcreto_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private void addObservador(ObservadorConcreto observador)
        {
            this.observadores.Add(observador);
        }

        public void notificar()
        {
            foreach(ObservadorConcreto observador in this.observadores)
            {
                observador.actualizar(this.cadena);
            }
        }

        public void des()
        {
            foreach(ObservadorConcreto observador in this.observadores)
            {
                observador.desactivar();
            }
        }

        public void acti()
        {
            foreach(ObservadorConcreto observador in this.observadores)
            {
                observador.acti();
            }
        }

        private System.Windows.Forms.Label txtConexion;
        private System.Windows.Forms.Button btnConectar;
        private System.Windows.Forms.Button btnConsulta;
        private System.Windows.Forms.Button btnDesconectar;
        private System.Windows.Forms.TextBox txtConsulta;
        private System.Windows.Forms.Button btnInstancia;
    }
}

